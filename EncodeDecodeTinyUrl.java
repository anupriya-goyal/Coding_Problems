//Encode Decode TinyURL
public class Codec {
    
    private Map<String, String> shortToLongMap;
    private Integer encodedValue;
    
    public Codec()
    {
        shortToLongMap= new HashMap<>();
        encodedValue=0;
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String encodedUrl= "http://www.tinyURL.com/"+ ++encodedValue;
        shortToLongMap.put(encodedUrl, longUrl);
        return encodedUrl;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if(shortToLongMap.containsKey(shortUrl))
        {
            return shortToLongMap.get(shortUrl);
        }
        
        return "";
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));