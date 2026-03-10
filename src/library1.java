public interface library1 {

    /**
     * adds title to library
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

}

/*
 * //import statements here ie. map, NN, more
 *
 * public class library {
 *
 * private String rep;
 *
 * private void createNewRep() { this.rep = ""; }
 *
 * public library() {
 *
 * }
 *
 * public library(String title) { this.rep = title; }
 *
 * //kernal Methods public String addBook(String title) { //something here
 *
 * }
 *
 * public String author() { //something here }
 *
 * public boolean isDone() { //something here }
 *
 * public String removeBook() { //something here }
 *
 * //secondary Methods public void addWordCount() { //something here }
 *
 * public String genre() { //something here }
 *
 * public void addGenre() { //something here }
 *
 * public static void main(String[] args) {
 *
 * }
 *
 * }
 *
 */
