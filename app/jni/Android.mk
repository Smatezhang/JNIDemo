LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)  #清除之前生成的东西
LOCAL_MODULE := demo
LOCAL_SRC_FILES := demo.c
include $(BUILD_SHARED_LIBRARY)