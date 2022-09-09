# sort\_integer\_with\_java\_access\_through\_http

Just a main method that makes a GET request to a server that holds the sort\_integer\_with\_java\_and\_servlet and displays the response.

<br/>
-- CallSortIntegers.java<br/>
public static void main(String[] args) {<br/>
&nbsp;&nbsp;&nbsp;&nbsp;String urlConnection = "http://localhost:8080/sort_integer_with_java_and_servlet_and_webxml/sortIntegers?intsToSort=6,8,3";<br/>
&nbsp;&nbsp;&nbsp;&nbsp;URL url = new URL(urlConnection);<br/>
&nbsp;&nbsp;&nbsp;&nbsp;HttpURLConnection con = (HttpURLConnection) url.openConnection();<br/>
&nbsp;&nbsp;&nbsp;&nbsp;con.setRequestMethod("GET");<br/>
&nbsp;&nbsp;&nbsp;&nbsp;syso(con.getInputStream());//[3,6,8]<br/>
	