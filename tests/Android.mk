LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

# We only want this apk build for tests.
LOCAL_MODULE_TAGS := tests
LOCAL_CERTIFICATE := shared

LOCAL_JAVA_LIBRARIES := android.test.runner

# Include all test java files.
LOCAL_SRC_FILES := $(call all-java-files-under, src)

LOCAL_PACKAGE_NAME := springflowtests

LOCAL_INSTRUMENTATION_FOR := springflow

include $(BUILD_PACKAGE)
