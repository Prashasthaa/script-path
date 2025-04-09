<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class StudentaController extends Controller
{
    //
    function show(){
        return "List of student from student controller";
    }
    function add(){
        return "add new student to student controller";
    }
    function delete(){
        return "delete of student from student controller";
    }
    function about($name){
        return $name;
    }
}
