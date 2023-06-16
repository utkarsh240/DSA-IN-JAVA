package main

import (
	"fmt"
	"io/ioutil"
	"os"
)

func main() {
	file, _ := os.Open("example.txt")
	defer file.Close()

	content, _ := ioutil.ReadAll(file)

	fmt.Println("File content:", string(content))
}
