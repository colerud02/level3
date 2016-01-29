package level3;

public class Song {
String name;
int Length;
public Song(String name, int Length) {
this.name=name;
this.Length=Length;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getLength() {
	return Length;
}
public void setLength(int length) {
	Length = length;
}
}
