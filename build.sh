#!/usr/bin/env bash
set -e
rm -rf out
mkdir -p out
javac -d out $(find src -name "*.java")
jar cfm lab2.jar manifest.mf -C out .
echo "Сборка завершена: lab2.jar"
