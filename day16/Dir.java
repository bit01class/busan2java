import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dir {

	public static void main(String[] args) {
		// dir만들기
		String path=".";
		if(args.length>0)
			path=args[0];
		File file=new File(path);
		if(file.exists()) {
			String[] arr=file.list();
			for(int i=0; i<arr.length; i++) {
				file=new File(arr[i]);
				long nalja=file.lastModified();
				Date d=new Date(nalja);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");
				String msg=sdf.format(d);
				System.out.print(msg+"\t");
				if(file.isDirectory())
				System.out.print("<DIR>"+"\t\t");
				else
				System.out.print("\t"+file.length()+"\t");
				System.out.println(file.getName());
			}
		}

	}

}






