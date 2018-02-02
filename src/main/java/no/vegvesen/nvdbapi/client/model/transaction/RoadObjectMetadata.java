/*
 * Copyright (c) 2015-2018, Statens vegvesen
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package no.vegvesen.nvdbapi.client.model.transaction;

import java.time.LocalDateTime;
import java.util.Objects;

public class RoadObjectMetadata {

    private final RoadObjectType roadObjectType;
    private final int version;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final LocalDateTime lastModified;

    public RoadObjectMetadata(RoadObjectType roadObjectType, int version, LocalDateTime startDate, LocalDateTime endDate, LocalDateTime lastModified) {
        this.roadObjectType = roadObjectType;
        this.version = version;
        this.startDate = startDate;
        this.endDate = endDate;
        this.lastModified = lastModified;
    }

    public RoadObjectType getRoadObjectType() {
        return roadObjectType;
    }

    public int getVersion() {
        return version;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoadObjectMetadata that = (RoadObjectMetadata) o;
        return getVersion() == that.getVersion() &&
            Objects.equals(getRoadObjectType(), that.getRoadObjectType()) &&
            Objects.equals(getStartDate(), that.getStartDate()) &&
            Objects.equals(getEndDate(), that.getEndDate()) &&
            Objects.equals(getLastModified(), that.getLastModified());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getRoadObjectType(), getVersion(), getStartDate(), getEndDate(), getLastModified());
    }

    @Override
    public String toString() {
        return "RoadObjectMetadata{" +
            "roadObjectType=" + roadObjectType +
            ", version=" + version +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", lastModified=" + lastModified +
            '}';
    }
}
