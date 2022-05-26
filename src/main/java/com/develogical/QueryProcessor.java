package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Alex";
        }
        if (query.toLowerCase().contains("plus")) {
            //67388ba0:%20what%20is%2018%20plus%2014
            String[] split_query = query.split("%20");
            int result = Integer.parseInt(split_query[3]) + Integer.parseInt(split_query[5]);
            return result;
        }
        return "";
    }
}
