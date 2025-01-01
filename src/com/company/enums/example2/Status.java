package com.company.enums.example2;

public enum Status {

    START {
        @Override
        public String getDescription() {
            return "Operation Started";
        }
    },
    PAUSE {
        @Override
        public String getDescription() {
            return "Operation Paused";
        }
    },
    STOP {
        @Override
        public String getDescription() {
            return "Operation Stopped";
        }
    };

    //Абстрактный метод который должен быть реализован у каждого элемента Enum
    public abstract String getDescription();
}
