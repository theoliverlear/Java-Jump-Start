package org.theoliverlear.learn.abstractions.constant;

public enum OfficerTitle {
    PRESIDENT("President"),
    VICE_PRESIDENT("Vice President"),
    TREASURER("Treasurer"),
    SECRETARY("Secretary");
    public final String title;
    OfficerTitle(String title) {
        this.title = title;
    }
}
