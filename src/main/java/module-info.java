module it.saimao.hminepos {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.prefs;

    exports it.saimao.tmk_typing_tutor_ssk;
    opens it.saimao.tmk_typing_tutor_ssk to javafx.fxml;
    exports it.saimao.tmk_typing_tutor_ssk.model;
    opens it.saimao.tmk_typing_tutor_ssk.model to javafx.fxml;
    exports it.saimao.tmk_typing_tutor_ssk.utils;
    opens it.saimao.tmk_typing_tutor_ssk.utils to javafx.fxml;
    exports it.saimao.tmk_typing_tutor_ssk.key_map;
    opens it.saimao.tmk_typing_tutor_ssk.key_map to javafx.fxml;

}