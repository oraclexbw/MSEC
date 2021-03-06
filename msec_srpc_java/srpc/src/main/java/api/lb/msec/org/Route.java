
/**
 * Tencent is pleased to support the open source community by making MSEC available.
 *
 * Copyright (C) 2016 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the GNU General Public License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. You may 
 * obtain a copy of the License at
 *
 *     https://opensource.org/licenses/GPL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the 
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */


package api.lb.msec.org;

/**
 * Created by Administrator on 2016/5/18.
 */
public class Route {

    public enum COMM_TYPE {COMM_TYPE_UDP, COMM_TYPE_TCP, COMM_TYPE_ALL};

    private String ip;
    private  COMM_TYPE comm_type;
    private int port;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public COMM_TYPE getComm_type() {
        return comm_type;
    }

    public void setComm_type(COMM_TYPE comm_type) {
        this.comm_type = comm_type;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route = (Route) o;

        if (port != route.port) return false;
        if (!ip.equals(route.ip)) return false;
        return comm_type == route.comm_type;

    }

    @Override
    public int hashCode() {
        int result = ip.hashCode();
        result = 31 * result + comm_type.hashCode();
        result = 31 * result + port;
        return result;
    }
}
