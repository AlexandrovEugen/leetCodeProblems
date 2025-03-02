package com.eval.year2025.educative._1TwoPointersAndCo.FirstBadVersion;

abstract class VersionControl {

    int firstBadVersion;

    void setFirstBadVersion(int version) {
        firstBadVersion = version;
    }

    boolean isBadVersion(int version) {
        return version >= firstBadVersion;
    }
}
