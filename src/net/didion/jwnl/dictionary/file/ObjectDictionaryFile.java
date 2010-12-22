package net.didion.jwnl.dictionary.file;

import java.io.IOException;

/** <code>DictioanryFile</code> that reads and writes serailazed objects. */
public interface ObjectDictionaryFile extends DictionaryFile {
	/** Read and deserialize an object from the file */
	public Object readObject() throws IOException, ClassNotFoundException;
	/** Serialize and write an object ot the file. */
	public void writeObject(Object obj) throws IOException;
}
