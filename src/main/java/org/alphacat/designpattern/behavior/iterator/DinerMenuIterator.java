package org.alphacat.designpattern.behavior.iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;   //position记录当前数组遍历的位置

    public DinerMenuIterator(MenuItem[] items) {  //构造器需要被传入一个菜单项的数组当作参数
        this.items = items;
    }

    @Override
    public Object next() {  //返回数组内的下一项，并递增其位置
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
    /*检查是否已经取得数组内所有的元素，如果还有元素待遍历则返回true；
     由于使用的是固定长度的数组，所以不但要检查是否超出了数组长度，也必须检查是否下一项是null，如果是null，就没有其他项了
    */
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
