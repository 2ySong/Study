cmake_minimum_required(VERSION 3.20)
project(C__coreCode)

set(CMAKE_CXX_STANDARD 14)

add_executable(C__coreCode main.cpp)

add_executable(1.1 01_memory/1.1.cpp)
add_executable(test test.cpp)
add_executable(test1 test1.cpp)