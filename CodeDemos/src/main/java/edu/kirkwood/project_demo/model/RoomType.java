package edu.kirkwood.project_demo.model;

public enum RoomType {
    SINGLE_QUEEN("Single Queen")
    , DOUBLE_QUEEN("Double Queen")
    , SINGLE_KING("Single King");
    private String description;

    RoomType(String description) {
        this.description = description;
    }

    public static RoomType getRoomType(String description) {
        for(RoomType roomType : RoomType.values()) {
            if(roomType.description.equals(description)) {
                return roomType;
            }
        }
        // return the default type if none are found
        return SINGLE_KING;
//        switch(description) {
//            case "Single Queen":
//                return SINGLE_QUEEN;
//            case "Double Queen":
//                return DOUBLE_QUEEN;
//            default:
//                return SINGLE_KING;
//        }
    }

    public String toString() {
        return description;
    }
}
