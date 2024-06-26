package com.filtec.rest.dto.response;

import com.filtec.rest.dto.Movie;
import com.filtec.rest.dto.Room;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class SessionResponse {
    private Long id;
    private LocalDateTime sessionStartTime;
    private LocalDateTime sessionEndTime;
    private BigDecimal basePrice;
    private Movie movie;
    private Room room;
    private List<SeatResponse> seats;
}