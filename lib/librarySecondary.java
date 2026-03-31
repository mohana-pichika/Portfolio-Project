public interface librarySecondary {
    /**
     * adds title to library.
     *
     * @param title
     * @return bookTitle
     * @updates this
     * @requires title != null
     */
    String addBook(String title);

    /**
     * calls for authors name.
     *
     * @return author's name
     * @updates this
     */
    String author();

    /**
     * checks if book is done.
     *
     * @return true if book is done, false otherwise
     */
    boolean isDone();

    /**
     * removes this from libary.
     *
     * @return removed book title
     */
    String removeBook();

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("(");
        result.append(this.isOpen());
        result.append(",\"");
        result.append(this.name());
        result.append("\",[contents])");
        return result.toString();
    }

    /**
     * compares this to another object for equality.
     * @return ans
     */
    public boolean equals(){
        //to be implemented
        return ans;
    }
}
