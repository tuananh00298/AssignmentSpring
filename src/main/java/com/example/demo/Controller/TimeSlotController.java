package com.example.demo.Controller;

import com.example.demo.Entity.AttendanceSlot;
import com.example.demo.Model.AttendanceSlotModel;
import com.example.demo.Model.TimeslotModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;
import java.util.Date;

@Controller
public class TimeSlotController {
    @Autowired
    private TimeslotModel timeslotModel;
    @Autowired
    private AttendanceSlotModel attendanceSlotModel;
    @RequestMapping(path = "/times", method = RequestMethod.GET)
    public String getListProduct(Model model, @RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "5") int limit){
        model.addAttribute("datetime", Calendar.getInstance().getTime());
        model.addAttribute("pagination", attendanceSlotModel.findAll(PageRequest.of(page - 1, limit)));
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        return "list-time";
    }
}
