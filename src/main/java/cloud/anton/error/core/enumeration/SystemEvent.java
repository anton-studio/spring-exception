package cloud.anton.error.core.enumeration;

import lombok.Getter;

@Getter
public enum SystemEvent {

    CALCULATION_EROOR(60000, "calculation error"),
    RESOURCE_NOT_FOUND(70000, "can't find your resoure");

    private Integer id;
    private String description;

    SystemEvent(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

}
