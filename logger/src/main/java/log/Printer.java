package log;

public interface Printer {

  Printer t(String tag, int methodCount);

  Settings init(String tag);

  Settings getSettings();

  void d(String tag, String message, Object... args);

  void d(String tag, Object object);

  void e(String tag, String message, Object... args);

  void e(String tag, Throwable throwable, String message, Object... args);

  void w(String tag, String message, Object... args);

  void i(String tag, String message, Object... args);

  void v(String tag, String message, Object... args);

  void wtf(String tag, String message, Object... args);

  void json(String tag, String json);

  void xml(String tag, String xml);

  void log(int priority, String tag, String message, Throwable throwable);

  void resetSettings();

}
