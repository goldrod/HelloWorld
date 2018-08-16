#include "com_ljch_helloworld_NDK.h"
/**
 * 上边的引用一定要和.h的文件名加后缀，
 * 下面的方法名一定要和.h文件中的方法名称一样
 */
JNIEXPORT jstring JNICALL Java_com_ljch_helloworld_NDK_getStringFromNative
            (JNIEnv *env, jobject obj) {
        return (*env)->NewStringUTF(env, "测试so文件");
}