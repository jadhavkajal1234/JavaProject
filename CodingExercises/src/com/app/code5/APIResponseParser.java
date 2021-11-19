package com.app.code5;

public class APIResponseParser {

    /**
     * Parses the input text and returns a Book instance containing
     * the parsed data.
     * @param response text to be parsed
     * @return Book instance containing parsed data
    */
    public static Book parse(String response) {
        Book book = new Book();
        String endRule = "<";

        String title = parse(response, "<title>", endRule);
        book.setTitle(title);
        System.out.println("Title : " +title);

        // Your code
        String author = parse(response, new String[] {"<author>", "<name>"}, endRule);
        book.setAuthor(author);
        System.out.println("author : " + author);

        String publicationYear = parse(response, "<original_publication_year type=\"integer\">", endRule);
        book.setPublicationYear(Integer.valueOf(publicationYear).intValue());
        System.out.println("Publication Year : " + publicationYear);

        String averageRating = parse(response, "<average_rating>", endRule);
        book.setAverageRating(Double.valueOf(averageRating).doubleValue());
        System.out.println("Average rating: " + averageRating);

        String ratingCount = parse(response, "<ratings_count type=\"integer\">", endRule);
        book.setRatingsCount(Integer.valueOf(ratingCount.replace(",", "")).intValue());
        System.out.println("Rating count : " + ratingCount);

        String imageUrl = parse(response, "<image_url>", endRule);
        book.setImageUrl(imageUrl);
        System.out.println("Image URL : " + imageUrl);

        return book;
    }

    // write overloaded parse method with the 3 parameters response, startRule, endRule
    public static String parse(String response, String startRule, String endRule) {
        return response.split(startRule)[1].trim().split(endRule)[0];
    }

    //Overloaded parse method - String []
    public static String parse(String response, String[] startRule, String endRule) {
        String strArr = response;
        for (String sRule : startRule) {
            strArr = strArr.split(sRule)[1].trim();
        }
        return strArr.trim().split(endRule)[0];
    }

    public static void main(String[] args) {
        String response = "<work>" +
                "<id type=\"integer\">2361393</id>" +
                "<books_count type=\"integer\">813</books_count>" +
                "<ratings_count type=\"integer\">1,16,315</ratings_count>" +
                "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
                "<original_publication_year type=\"integer\">1854</original_publication_year>" +
                "<original_publication_month type=\"integer\" nil=\"true\"/>" +
                "<original_publication_day type=\"integer\" nil=\"true\"/>" +
                "<average_rating>3.79</average_rating>" +
                "<best_book type=\"Book\">" +
                "<id type=\"integer\">16902</id>" +
                "<title>Walden</title>" +
                "<author>" +
                "<id type=\"integer\">10264</id>" +
                "<name>Henry David Thoreau</name>" +
                "</author>" +
                "<image_url>" +
                "http://images.gr-assets.com/books/1465675526m/16902.jpg" +
                "</image_url>" +
                "<small_image_url>" +
                "http://images.gr-assets.com/books/1465675526s/16902.jpg" +
                "</small_image_url>" +
                "</best_book>" +
                "</work>";

        APIResponseParser.parse(response);
    }
}
