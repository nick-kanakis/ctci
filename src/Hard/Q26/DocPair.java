package Hard.Q26;

/**
 * Created by Nicolas on 3/2/2018.
 */
public class DocPair {
    public int doc1Id, doc2Id;

    public DocPair(int doc1Id, int doc2Id) {
        this.doc1Id = doc1Id;
        this.doc2Id = doc2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocPair docPair = (DocPair) o;

        if (doc1Id != docPair.doc1Id) return false;
        return doc2Id == docPair.doc2Id;
    }

    @Override
    public int hashCode() {
        int result = doc1Id;
        result = 31 * result + doc2Id;
        return result;
    }
}
