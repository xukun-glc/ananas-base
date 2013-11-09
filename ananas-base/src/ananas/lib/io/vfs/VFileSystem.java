package ananas.lib.io.vfs;

import java.net.URI;

public interface VFileSystem {

	VFileSystemFactory getFactory();

	VFileSystemConfiguration getConfiguration();

	// new file

	VFile newFile(VFile dir, String string);

	VFile newFile(String dir, String string);

	VFile newFile(String path);

	VFile newFile(URI uri);

	String pathSeparator();

	String separator();

	char pathSeparatorChar();

	char separatorChar();

	VPathAbsolute newAbsolutePath(String string);

	VPathRelative newRelativePath(String string);

}
