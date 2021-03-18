package file_transfer;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

public class FileCopy {

    public static void copy(final String src, final String target) throws IOException {
        if(StringUtils.isEmpty(src) || StringUtils.isEmpty(target)){
            throw new IllegalArgumentException("src or target required");
        }
    }

    public static String getFileName(final String src){
        assert StringUtils.isEmpty(src);

        final File file = new File(src);
        if(file.isFile()){
            return file.getName();
        }else{
            throw new RuntimeException("src is not a valid file");
        }
    }

    private static void transfer(final FileChannel from, final FileChannel to, long position, long size) throws IOException{
        assert !Objects.isNull(from) && !Objects.isNull(to);
        while(position < size){
            position += from.transferTo(position, Con)
        }
    }


}
