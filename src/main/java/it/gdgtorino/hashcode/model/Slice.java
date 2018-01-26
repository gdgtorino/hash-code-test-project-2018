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
package it.gdgtorino.hashcode.model;

/**
 * Slice model class.
 *
 * @author Marco Terrinoni <marco.terrinoni@gmail.com>
 */
public class Slice {

  private Integer x0 = null;
  private Integer x1 = null;
  private Integer y0 = null;
  private Integer y1 = null;

  public Slice() {
  }

  public Slice(Integer x0, Integer x1, Integer y0, Integer y1) {
    this.x0 = x0;
    this.x1 = x1;
    this.y0 = y0;
    this.y1 = y1;
  }

  public Integer getX0() {
    return x0;
  }

  public void setX0(Integer x0) {
    this.x0 = x0;
  }

  public Integer getX1() {
    return x1;
  }

  public void setX1(Integer x1) {
    this.x1 = x1;
  }

  public Integer getY0() {
    return y0;
  }

  public void setY0(Integer y0) {
    this.y0 = y0;
  }

  public Integer getY1() {
    return y1;
  }

  public void setY1(Integer y1) {
    this.y1 = y1;
  }
}
