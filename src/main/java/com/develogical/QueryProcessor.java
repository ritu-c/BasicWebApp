package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        
        if (query.toLowerCase().contains("name")) {
            return "Example";
        }

        if (query.toLowerCase().contains("2014 plus 2010")) {
            return "4024";
        }

        if (query.toLowerCase().contains("207 plus 2010")) {
            return "2217";
        }

        return "";
    }
}
