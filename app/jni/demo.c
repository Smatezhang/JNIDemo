#include <jni.h>
JNIEXPORT jstring JNICALL Java_com_zhuoxin_zhang_jnidemo_MainActivity_getStrFromJNI
  (JNIEnv * env , jobject thiz){
  return (*env)->NewStringUTF(env,"hello from c!!!");
  }
