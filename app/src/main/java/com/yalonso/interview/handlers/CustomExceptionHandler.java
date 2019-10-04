package com.yalonso.interview.handlers;

import android.content.Context;
import android.util.Log;

public class CustomExceptionHandler implements Thread.UncaughtExceptionHandler {

    private final Thread.UncaughtExceptionHandler uncaughtExcept;
    private static final String TAG = "ExceptionHandler";
    private final Context context;

    public CustomExceptionHandler(Thread.UncaughtExceptionHandler originalHandler, Context context) {
        this.uncaughtExcept = originalHandler;
        this.context = context;

        Log.e(TAG, "CustomExceptionHandler created, original handler is "
                + (originalHandler == null ? "null" : originalHandler.getClass().getName()));
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        Object[] location = exceptionLocationIdentification(ex);

        Log.e(TAG, "uncaughtException: "
                + String.valueOf(location[1]) + "." + String.valueOf(location[2]) + "()" + " : "
                + ex);
    }

    private Object[] exceptionLocationIdentification(Throwable exception) {
        Object[] location = new Object[4];
        StackTraceElement[] stackTrace = exception.getCause() == null ? exception.getStackTrace() : exception.getCause().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[0];

        Log.e(TAG, stackTraceElement.toString());

        String fullClassName = stackTraceElement.getClassName();
        location[0] = fullClassName;
        String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
        location[1] = className;
        String methodName = stackTraceElement.getMethodName();
        location[2] = methodName;
        int lineNumber = stackTraceElement.getLineNumber();
        location[3] = lineNumber;
        return location;
    }
}

