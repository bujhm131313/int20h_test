package klenn

class Flickr(args: Array[String]) {

  def getPhotoIds() : List[Int] = {
    val apiKey = "54dbd4accaf429de14aedc98e9efbfe5"
    val apiSecret = "e99d46ea7f3cda3a"

    val url = "https://api.flickr.com/services/rest/?method=flickr.photosets.getPhotos"

    val r = requests.get (url, data = Map (
    "api_key" -> apiKey,
    "photoset_id" -> "72157674388093532",
    "user_id" -> "144522605@N06",
    "extras" -> "tags",
    )
    )
    println (r.text)
    List(1,2,3)
  }
}
