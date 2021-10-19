package com.IO;

import java.nio.charset.Charset;

/* @param Java use auto Encoding
 * @param to check which encoding it uses use following code
 */
public class JavaEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("file.encoding"));
		System.out.println(Charset.defaultCharset());

	}

}
