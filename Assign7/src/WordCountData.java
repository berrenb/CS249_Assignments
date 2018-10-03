/*
 Created by Bryan Berrent
 
 The WordCountData class contains a constructor which initializes the values
 of charCnt, wordCnt, and lineCnt.
 The WordCountData class also contains getter methods to obtain the values
 of charCnt, wordCnt, and lineCnt.
 */
public class WordCountData {
	private int charCnt = 0;
	private int wordCnt = 0;
	private int lineCnt = 0;
	
	public WordCountData(int c, int w, int l){
		charCnt = c;
		wordCnt = w;
		lineCnt = l;
	}
	
	public int getChar(){
		return charCnt;
	}
	public int getWord(){
		return wordCnt;
	}
	public int getLine(){
		return lineCnt;
	}
}
