package level3;

import java.util.ArrayList;

import javax.annotation.Generated;

public class CDPlayer {
public static void main(String[] args) {
	ArrayList <Song> CD = new ArrayList<Song>();
	CD.add(new Song("Stairway to Heavn",100000));
	CD.add(new Song("Highway to Hell",666));
	CD.add(new Song("Feigo", 9001));
	System.out.println(getDuration(CD));
}

public static int getDuration(ArrayList<Song> CD){
	int totallenth = 0;
	
	for (Song song : CD) {
	totallenth = totallenth + song.getLength();
	
	}
	return totallenth;
}

}
