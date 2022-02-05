class Record:
    def __init__(self, record):
        self.time = int(record[0:2]) * 60 + int(record[3:5])
        self.car_num = record[6:10]
        self.parking = [self.time]
        self.total_time = 0

    def get_fee(self, fees):
        if self.parking:
            self.merge(self.__get_mid_night())
        
        default_m, default_fee, unit_m, unit_fee = fees
        
        total_fee = default_fee
        self.total_time -= default_m
        if self.total_time > 0:
            total_fee += (self.total_time % unit_m != 0) * unit_fee 
            total_fee += (self.total_time // unit_m) * unit_fee
        return total_fee

    def __get_mid_night(self):
        return Record("23:59" + " " + self.car_num)
    
    def merge(self, other):
        if self.parking:
            self.total_time += other.time - self.parking.pop()
        else:
            self.parking.append(other.time)
        
def solution(fees, records_entity):
    # parsing & sort
    records = [Record(record) for record in records_entity]
    sorted_records = sorted(records, key= lambda x: (x.car_num, x.time))
    
    # except
    if len(sorted_records) == 1:
        return [sorted_records[0].get_fee(fees)]
    
    # merge
    records = [sorted_records[0]]
    for record in sorted_records[1:]:
        if records[-1].car_num == record.car_num:
            records[-1].merge(record)
        else:
            records.append(record)
    
    return [record.get_fee(fees) for record in records]