package mad.learn.cseries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IPConfig {
	public static void main(String args[]) throws IOException {
		
		IPConfig.assignIP();
	}

	private static void  assignIP() throws IOException {

		int osType = 1;
		//Process p;
		if (osType == 1) {
			Runtime rt = Runtime.getRuntime();
			

				
				//192.168.56.1
				String str1 = "192.168.0.201";
				String str2 = "255.255.255.0";
				String[] command1 = { "netsh", "interface", "ip", "set", "address", "name=", "VirtualBox Host-Only Network",
						"source=static", "addr=", str1, "mask=", str2 };

				ProcessBuilder pb = new ProcessBuilder(command1);
				pb.redirectErrorStream(true);
				
				Process process = pb.start();

				//p = rt.exec(command1);
				
				BufferedReader reader = new BufferedReader(
					    new InputStreamReader(process.getInputStream()));
					String line = null;
					while ((line = reader.readLine()) != null) {
					    System.out.println(line);
					}
				
			}
				
				/*FileInputStream f = (FileInputStream) p.getErrorStream(); 
				
				//System.out.println(p.getInputStream().read());
				//System.out.println(p.getOutputStream());
				
				
				
				
				int ch;
				while((ch=p.getInputStream().read())!=-1)
		            System.out.print((char)ch);
				
			} catch (Exception ex) {
				System.out.println("error ishere");
			}
*/
		

	}

	private static int checkOS() {
		String os = System.getProperties().getProperty("os.name");
		System.out.println("\n\n\n\n#" + os + "#\n\n\n\n");
		if (os.equals("Windows 2000"))
			return 1;
		else
			return 0;
	}
}