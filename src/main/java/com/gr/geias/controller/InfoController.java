package com.gr.geias.controller;

import com.gr.geias.entity.*;
import com.gr.geias.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    CollegeService collegeService;
    @Autowired
    SpecialtyService specialtyService;
    @Autowired
    ClassGradeService classGradeService;
    @Autowired
    AreaService areaService;
    @Autowired
    EmploymentWayService employmentWayService;
    @Autowired
    UnitKindService unitKindService;
    @Autowired
    EmploymentInformationService employmentInformationService;

    @RequestMapping("/getcollege")
    public Map<String, Object> getCollege() {
        Map<String, Object> map = new HashMap<>(3);
        List<College> collegeList = collegeService.getCollege(null);
        map.put("success", true);
        map.put("collegeList", collegeList);
        return map;
    }

    @RequestMapping("/getspecialty")
    public Map<String, Object> getSpecialty(@RequestParam("collegeId") Integer collegeId) {
        Map<String, Object> map = new HashMap<>(3);
        List<Specialty> specialty = specialtyService.getSpecialty(collegeId);
        map.put("success", true);
        map.put("specialtyList", specialty);
        return map;
    }

    @RequestMapping("/getclassgrade")
    public Map<String, Object> getClassGrade(@RequestParam("specialtyId") Integer specialtyId) {
        Map<String, Object> map = new HashMap<>(3);
        List<ClassGrade> classGrade = classGradeService.getClassGrade(specialtyId, null);
        map.put("success", true);
        map.put("classGradeList", classGrade);
        return map;
    }

    @RequestMapping("/getinit")
    public Map<String, Object> getinit() {
        Map<String, Object> map = new HashMap<>(4);
        List<Area> area = areaService.getArea(null);
        map.put("areaList", area);
        List<EmploymentWay> employmentWay = employmentWayService.getEmploymentWay();
        map.put("employmentWayList", employmentWay);
        List<UnitKind> unitKind = unitKindService.getUnitKind();
        map.put("unitKindList", unitKind);
        map.put("success", true);
        return map;
    }

    @RequestMapping("/addemploymentinfo")
    public Map<String, Object> addEmploymentInfo(@RequestParam("studentNum") Integer studentNum,
                                                 @RequestParam("name") String name,
                                                 @RequestParam("gender") Integer gender,
                                                 @RequestParam("collegeId") Integer collegeId,
                                                 @RequestParam("specialtyId") Integer specialtyId,
                                                 @RequestParam("classId") Integer classId,
                                                 @RequestParam("areaId") Integer areaId,
                                                 @RequestParam("unitId") Integer unitId,
                                                 @RequestParam("employmentWayId") Integer employmentwayId,
                                                 @RequestParam("salary") String salary) {
        Map<String, Object> map = new HashMap<>(3);
        EmploymentInformation infoByStudentNum = employmentInformationService.getInfoByStudentNum(studentNum);
        EmploymentInformation employmentInfo = new EmploymentInformation();
        if (infoByStudentNum != null) {
            map.put("success", false);
            map.put("writed", true);
            map.put("errMsg", "该学号已经填写过了");
            return map;
        }
        employmentInfo.setStudentNum(studentNum);
        employmentInfo.setName(name);
        employmentInfo.setGender(gender);
        College college = new College();
        college.setCollegeId(collegeId);
        employmentInfo.setCollege(college);
        Specialty specialty = new Specialty();
        specialty.setSpecialtyId(specialtyId);
        employmentInfo.setSpecialty(specialty);
        ClassGrade classGrade = new ClassGrade();
        classGrade.setClassId(classId);
        employmentInfo.setClassGrade(classGrade);
        Area area = new Area();
        area.setAreaId(areaId);
        employmentInfo.setArea(area);
        UnitKind unitKind = new UnitKind();
        unitKind.setUnitId(unitId);
        employmentInfo.setUnitKind(unitKind);
        EmploymentWay employmentWay = new EmploymentWay();
        employmentWay.setEmploymentWayId(employmentwayId);
        employmentInfo.setEmploymentWay(employmentWay);
        employmentInfo.setSalary(salary);
        employmentInfo.setCreateTime(new Date());
        Integer integer = employmentInformationService.addEmploymentInfo(employmentInfo);
        if (integer > 0) {
            map.put("success", true);
        } else {
            map.put("success", false);
            map.put("errMsg", "出现错误");
        }
        return map;
    }

    @RequestMapping("/modeifyemploymentinfo")
    public Map<String, Object> modeifyemploymentinfo(@RequestParam("studentNum") Integer studentNum,
                                                     @RequestParam("name") String name,
                                                     @RequestParam("gender") Integer gender,
                                                     College college,
                                                     Specialty specialty,
                                                     ClassGrade classGrade,
                                                     Area area,
                                                     UnitKind unitKind,
                                                     EmploymentWay employmentWay,
                                                     @RequestParam("salary") String salary) {
        Map<String, Object> map = new HashMap<>(3);
        EmploymentInformation employmentInfo = employmentInformationService.getInfoByStudentNum(studentNum);
        employmentInfo.setStudentNum(studentNum);
        employmentInfo.setName(name);
        employmentInfo.setGender(gender);
        employmentInfo.setCollege(college);
        employmentInfo.setSpecialty(specialty);
        employmentInfo.setClassGrade(classGrade);
        employmentInfo.setArea(area);
        employmentInfo.setUnitKind(unitKind);
        employmentInfo.setEmploymentWay(employmentWay);
        employmentInfo.setSalary(salary);
        employmentInfo.setCreateTime(new Date());
        int i = employmentInformationService.updateInfo(employmentInfo);
        if (i > 0) {
            map.put("success", true);
        } else {
            map.put("success", false);
            map.put("errMsg", "出现错误");
        }
        return map;
    }
}
