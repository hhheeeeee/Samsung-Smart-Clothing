package sueprtizen.smartclothing.domain.calendar.service;

import sueprtizen.smartclothing.domain.calendar.dto.*;

public interface CalendarService {
    CalendarMonthlyScheduleResponseDTO calendarMonthlySchedules(
            int userId,
            String startDate,
            String endDate
    );

    void scheduleSave(
            int userId,
            ScheduleSaveRequestDTO scheduleSaveRequestDTO
    );

    void scheduleDelete(
            int userId,
            String date
    );

    ScheduleDetailResponseDTO scheduleConfirmation(
            int userId,
            String scheduleId
    );

    ScheduleOutfitResponseDTO scheduleOutfitConformation(int userId, String date);


    ScheduleCheckingResponseDTO scheduleChecking(int userId, String date);
}
