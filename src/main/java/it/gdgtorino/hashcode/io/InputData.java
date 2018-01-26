/*
 * The MIT License
 *
 * Copyright 2018 Google Developer Group Torino.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package it.gdgtorino.hashcode.io;

/**
 * Wrapper class for input data. Just substitute the local variable with the real ones.
 *
 * @author Marco Terrinoni <marco.terrinoni@gmail.com>
 */
public class InputData {

  // First line values
  private Integer row = null;
  private Integer column = null;
  private Integer numIngredientsPerSlice = null;
  private Integer maxCellsPerSlice = null;

  // Following lines data
  private List<List<Cell>> data; // this is just a placeholder for the real data-structure

  public InputData() {
  }

  public InputData(Integer row, Integer column, Integer numIngredientsPerSlice,
      Integer maxCellsPerSlice, List<List<Cell>> data) {
    this.row = row;
    this.column = column;
    this.numIngredientsPerSlice = numIngredientsPerSlice;
    this.maxCellsPerSlice = maxCellsPerSlice;
    this.data = data;
  }

  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public Integer getNumIngredientsPerSlice() {
    return numIngredientsPerSlice;
  }

  public void setNumIngredientsPerSlice(Integer numIngredientsPerSlice) {
    this.numIngredientsPerSlice = numIngredientsPerSlice;
  }

  public Integer getMaxCellsPerSlice() {
    return maxCellsPerSlice;
  }

  public void setMaxCellsPerSlice(Integer maxCellsPerSlice) {
    this.maxCellsPerSlice = maxCellsPerSlice;
  }

  public List<List<Cell>> getData() {
    return data;
  }

  public void setData(List<List<Cell>> data) {
    this.data = data;
  }
}
