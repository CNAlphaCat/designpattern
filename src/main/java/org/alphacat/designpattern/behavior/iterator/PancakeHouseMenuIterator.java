package org.alphacat.designpattern.behavior.iterator;

import java.util.ArrayList;

//实现迭代器接口  PancakeHouseMenu
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;   //position记录当前数组遍历的位置

    public PancakeHouseMenuIterator(ArrayList items) {  //构造器需要被传入一个菜单项的数组当作参数
        this.items = items;
    }

    @Override
    public Object next() {  //返回数组内的下一项，并递增其位置
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
}
