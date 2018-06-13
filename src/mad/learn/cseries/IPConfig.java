package mad.learn.cseries;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPConfigTest
{
    public static void main( String args[] )
        throws UnknownHostException
    {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println( "IP Address:- " + inetAddress.getHostAddress() );
        System.out.println( "Host Name:- " + inetAddress.getHostName() );
        ProcessBuilder pb = null;
        
        String[] ipconfigCmd =
            { "netsh", "interface", "ip", "set", "address", "name=", "Local Area Connection",
              "source=static", "addr=", ipAddresstobeconfigured, "mask=", subnetMask };
            
        
        String[] ipconfigDefaultCmd =
            { "netsh", "interface", "ip", "set", "address", "name=", "Local Area Connection",
              "source=DHCP" };
        
        /*String[] ipconfigDefaultCmd =
        { "netsh", "interface", "ip", "show", "config" };*/
        try
        {
            pb = new ProcessBuilder( ipconfigDefaultCmd );
            Process process = pb.start();
            BufferedReader reader = new BufferedReader( new InputStreamReader( process
                    .getInputStream() ) );
            String line = null;
            while ( ( line = reader.readLine() ) != null )
            {
                System.out.println( line );
            }
        }
        catch ( Exception e )
        {
            e.printStackTrace();
        }
    }
}
