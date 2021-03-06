package org.acgcloud.filesys.services.opt;

import cn.hutool.core.io.FileUtil;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.acgcloud.filesys.dto.FileOptionRequest;
import org.acgcloud.filesys.services.IFileOptStragy;

import java.io.File;

@Component
@Data
public class CopyFile implements IFileOptStragy {

    private File file;

    private FileOptionRequest fileOptionRequest;


    @Override
    public String getOptCn() {
        return "复制文件";
    }

    @Override
    public String support() {
        return "copy";
    }

    @Override
    public void handle() {
        return;
    }
}
