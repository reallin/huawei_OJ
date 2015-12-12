package arrayio;
import java.io.*;
public class arrayIo {
public static void main(String[] args) throws Exception{
	byteioRead();
	System.out.println();
	StringioRead();
}
public static void byteioRead() throws Exception{
	ByteArrayInputStream bai = new ByteArrayInputStream("abc".getBytes());
	ByteArrayOutputStream bao = new ByteArrayOutputStream();
	int len = 0;
	while((len = bai.read()) != -1){
		bao.write(len);
	}
	bao.writeTo(System.out);
	//System.out.print(bao.toString());
	bao.close();
}
public static void StringioRead() throws Exception{
	StringReader bai = new StringReader("²ñ½ðÐñ");
	StringWriter bao = new StringWriter();
	int len = 0;
	while((len = bai.read()) != -1){
		bao.write(len);
	}
	//bao.write(System.out);
	System.out.print(bao.toString());
	bao.close();
}
}
