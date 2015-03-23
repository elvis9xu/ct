package com.xjd.ct.utl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class DigestUtil {
	public static String md5(String text) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(text.getBytes());
			byte[] digest = md.digest();

			StringBuilder buf = new StringBuilder(32);
			int t;
			for (int i = 0; i < digest.length; i++) {
				t = digest[i];
				if (t < 0) {
					t += 256;
				}
				if (t < 16) {
					buf.append("0");
				}
				buf.append(Integer.toHexString(t));
			}
			return buf.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static String sha(String text) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA");
			md.update(text.getBytes());
			byte[] digest = md.digest();

			StringBuilder buf = new StringBuilder(40);
			int t;
			for (int i = 0; i < digest.length; i++) {
				t = digest[i];
				if (t < 0) {
					t += 256;
				}
				if (t < 16) {
					buf.append("0");
				}
				buf.append(Integer.toHexString(t));
			}
			return buf.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
}
