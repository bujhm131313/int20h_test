import scalaj.http.Http

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    val apiKey = "54dbd4accaf429de14aedc98e9efbfe5"
    val apiSecret = "e99d46ea7f3cda3a"

    val request = "https://api.flickr.com/services/rest/?method=flickr.test.echo&name=value"
    val result = Http(request).asString
    println(result)

  }
}