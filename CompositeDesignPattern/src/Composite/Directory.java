
package Composite;

import java.util.ArrayList;

/**
 *
 * @author Luchn1k
 */
public class Directory extends AbstractStructure {

    private final ArrayList<AbstractStructure> FILE_LIST;

    public Directory(String name) {
        this.name = name;
        this.FILE_LIST = new ArrayList();
    }

    public void addFile(AbstractStructure file) {
        FILE_LIST.add(file);
        add(file);
        if (file.getClass().toString().contains("Directory")) {
            folderCount++;
        } else {
            fileCount++;
        }
    }

    @Override
    public double getSize() {
        double size = this.size;
        for (AbstractStructure file : FILE_LIST) {
            size += file.getSize();
        }
        return size;
    }

    @Override
    public int getFileCount() {
        int c = fileCount;
        for (AbstractStructure file : FILE_LIST) {
            c += file.getFileCount();
        }
        return c;
    }

    @Override
    public int getDirectoryCount() {
        int c = folderCount;
        for (AbstractStructure file : FILE_LIST) {
            c += file.getDirectoryCount();
        }
        return c;
    }

}
