/*
 Created by Bryan Berrent
 Uses adaptation from the InClass exercise on 10/31 URLCounter
 
 The WordCounter class contains one method called count
 The count method take a String called path and determines
 if the path is a website link or a txt file. 
 The method will then determine the amount of characters, words, and lines
 The results will be stored into an instance of the WordCountData class
 */

import java.io.File;
import java.net.URL;
import java.util.*;
public class WordCounter {
	public static WordCountData count(String path)throws Exception{
		
		int charCnt = 0;
		int wordCnt = 0;
		int lineCnt = 0;
		
		if(path.contains("http")){
			URL url = new URL(path);
			Scanner inputURL = new Scanner(url.openStream());
			
	
			while(inputURL.hasNext()){
				String line = inputURL.nextLine();
				for(int i = 0;i<line.length();i++){
					if(line.charAt(i)==' '){
						wordCnt++;
					}
				}
				charCnt += line.length();
				lineCnt++;
			}
			
			inputURL.close();
		}
		else{
			Scanner inputFile = new Scanner(new File(path));
			while(inputFile.hasNext()){
				String s = inputFile.nextLine();
				for(int i = 0; i < s.length();i++){
					if(s.charAt(i)==' '){
						wordCnt++;
					}
				}
				charCnt += s.length();
				lineCnt++;
				
			}
			inputFile.close();
		}
		WordCountData wcd = new WordCountData(charCnt,wordCnt,lineCnt);
		return wcd;
	}
}
