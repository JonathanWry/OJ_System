package com.yupi.yuojcodesandbox.security;

import java.security.Permission;

/**
 * 默认安全管理器
 */
public class MySecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
//        super.checkPermission(perm);
    }

    @Override
    public void checkExec(String cmd) {

//        throw new SecurityException("checkExec权限异常:" + cmd);
    }

    @Override
    public void checkRead(String file) {
        if(file.contains("hutool")){
            return;
        }
//        throw new SecurityException("checkRead权限异常:" + file);
    }

    @Override
    public void checkWrite(String file) {
//        throw new SecurityException("checkWrite权限异常:" + file);
    }

    @Override
    public void checkDelete(String file) {
//        throw new SecurityException("checkDelete权限异常:" + file);
    }

    @Override
    public void checkConnect(String host, int port) {
        throw new SecurityException("checkConnect权限异常:" + host + ":" + port);
    }
}
