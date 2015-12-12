package sgdb.tool.spider2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class AutoReportRobot {
	protected static DefaultHttpClient _httpClient = null;
	protected final static String ENCODE = "UTF-8";
	protected final static String HTTP_CHARSET = "UTF-8";
	protected static String host = "http://nadr.hust.edu.cn/cmis";
	protected static String userAgent = 
			"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.101 Safari/537.36";
	public static String readReportContent() {
        try {
            BufferedReader bis = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\reportText.txt"),ENCODE) );
            String szContent="";
            String szTemp;
            while ( (szTemp = bis.readLine()) != null) {
                szContent+=szTemp+"\n";
            }
            bis.close();
            System.out.println("ReportContent--->"+szContent);
            return szContent;
        }
        catch( Exception e ) {
            return "";
        }
	}
	
	public static int toIndex() {
		HttpGet toIndexRequest = null;
		  HttpParams httpParams = _httpClient.getParams();
		  HttpConnectionParams.setConnectionTimeout(httpParams, 2000);  
		        HttpConnectionParams.setSoTimeout(httpParams, 4000);
		 try {
			 	toIndexRequest = new HttpGet(host+"/toIndex.action");
			 	HttpResponse httpResponse = _httpClient.execute(toIndexRequest);
			 	int statusCode = httpResponse.getStatusLine().getStatusCode();
			 	if (statusCode != 200) {
			 		toIndexRequest.abort();
			 		throw new RuntimeException("HttpClient,error status code :"
			 				+ statusCode);
			 	}
		 } catch (Exception e) {
			 return 404;
		 } finally {
			 if(toIndexRequest!=null)
				 toIndexRequest.releaseConnection();
		 }
		 return 200;
	}
	
	public static void rand()  {
		HttpGet randRequest = null;
		 try {
			 randRequest = new HttpGet(host+"/rand.action");
			 	HttpResponse httpResponse = _httpClient.execute(randRequest);
			 	int statusCode = httpResponse.getStatusLine().getStatusCode();
			 	if (statusCode != 200) {
			 		randRequest.abort();
			 		throw new RuntimeException("HttpClient,error status code :"
			 				+ statusCode);
			 	}
		 } catch (Exception e) {
			 e.printStackTrace();
		 } finally {
			 if(randRequest!=null)
				 randRequest.releaseConnection();
		 }
	}
	
	public static void doLogin()  {
		HttpGet doLoginRequest = null;
		 try {
			 doLoginRequest = new HttpGet(host+"/user/dologin.action");
			 	doLoginRequest.addHeader("Referer", "http://nadr.hust.edu.cn/cmis/toIndex.action");
				HttpResponse httpResponse = _httpClient.execute(doLoginRequest);
//				 int statusCode = httpResponse.getStatusLine().getStatusCode();
////				 if (statusCode != 200) {
////					 doLoginPost.abort();
////				     throw new RuntimeException("HttpClient,error status code :"
////				    		 + statusCode);
////				  }
//				HttpEntity entity = httpResponse.getEntity();
//				String context = null;
//				if (entity != null) {
//					 context = EntityUtils.toString(entity, "utf-8");
//				 }
//				System.out.println(context);
		 } catch (Exception e) {
			 e.printStackTrace();
		 } finally {
			 if(doLoginRequest!=null)
				 doLoginRequest.releaseConnection();
		 }
	}
	
	
	public static void Login(String name, String passWord) {
		HttpPost doLoginPost = null;
		try {
			doLoginPost =  new HttpPost(host+"/user/login.action");
			List <NameValuePair> params = new ArrayList<NameValuePair>();  
	        params.add(new BasicNameValuePair("j_username", name)); 
	        params.add(new BasicNameValuePair("j_password", passWord)); 
	        params.add(new BasicNameValuePair("rand", "1991")); 
	        doLoginPost.setEntity(new UrlEncodedFormEntity(params,HTTP_CHARSET));
	        doLoginPost.addHeader("Referer", "http://nadr.hust.edu.cn/cmis/toIndex.action");
			HttpResponse httpResponse = _httpClient.execute(doLoginPost);
			 int statusCode = httpResponse.getStatusLine().getStatusCode();
//			 if (statusCode != 200) {
//				 doLoginPost.abort();
//			     throw new RuntimeException("HttpClient,error status code :"
//			    		 + statusCode);
//			  }
//			HttpEntity entity = httpResponse.getEntity();
//			String context = null;
//			if (entity != null) {
//				 context = EntityUtils.toString(entity, "utf-8");
//			 }
//			System.out.println(context);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(doLoginPost!=null) 
				doLoginPost.releaseConnection();
		}
	}
	public static void preReport() {
		HttpGet httpGet = null;
		 try {
			 httpGet = new HttpGet("http://nadr.hust.edu.cn/cmis/report/toAddReport.action?type=1");
			 httpGet.addHeader("Referer", "http://nadr.hust.edu.cn/cmis/user/dologin.action");
			 HttpResponse httpResponse = _httpClient.execute(httpGet);
			  HttpEntity entity = httpResponse.getEntity();
			  String result = null;
			  if (entity != null) {
				  result = EntityUtils.toString(entity, "utf-8");
			  }
			  System.out.println("toAddReport.action--->\n"+result);
			  } catch (Exception e) {
				  e.printStackTrace();
			  }
		 finally{
			 if(httpGet!=null) {
				 httpGet.releaseConnection();
			 }
		 }
	}
	public static void Report() {
		HttpPost reportPost = null;
		try {
			reportPost =  new HttpPost(host+"/report/addReport.action");
			List <NameValuePair> params = new ArrayList<NameValuePair>();  
	        params.add(new BasicNameValuePair("type", "1")); 
	        params.add(new BasicNameValuePair("report.reportdate", "2015-05-21")); 
	        params.add(new BasicNameValuePair("report.content", readReportContent())); 
	        reportPost.setEntity(new UrlEncodedFormEntity(params,HTTP_CHARSET));
	        reportPost.addHeader("Referer", "http://nadr.hust.edu.cn/cmis/report/toAddReport.action?type=1");
			HttpResponse httpResponse = _httpClient.execute(reportPost);
			 int statusCode = httpResponse.getStatusLine().getStatusCode();
//			 if (statusCode != 200) {
//				 doLoginPost.abort();
//			     throw new RuntimeException("HttpClient,error status code :"
//			    		 + statusCode);
//			  }
			HttpEntity entity = httpResponse.getEntity();
			String context = null;
			if (entity != null) {
				 context = EntityUtils.toString(entity, "utf-8");
			 }
			System.out.println("toAddReport.action--->\n"+context);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(reportPost!=null) 
				reportPost.releaseConnection();
		}
	}
	
	public static void main(String[] args) {
		_httpClient = new DefaultHttpClient();
		_httpClient.getParams().setParameter("User-Agent", userAgent);
		toIndex(); //可拿来测试连通性，若函数返回404代表服务器未开
		rand();
		Login("LEBRONS","yyt243783340123");
		doLogin();
		preReport();
		Report();
	}
}
