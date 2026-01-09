package dev.danvega.server;

import java.util.List;

public record Session(
        String day,
        String time,
        String duration,
        String title,
        String type,
        String[] speakers,
        String room,
        List<String> track
) {
}